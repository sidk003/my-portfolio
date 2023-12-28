import React, { useState } from "react";
import {
  AppBar,
  Box,
  Toolbar,
  IconButton,
  Typography,
  Drawer,
} from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
import { ListItems } from "./ListItems";
import { UserProfile } from "./UserProfile";

export const TopBar = () => {
  const [isDrawerOpen, setIsDrawerOpen] = useState(false);

  const toggleSlider = () => {
    setIsDrawerOpen(!isDrawerOpen);
  };

  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="static">
        <Toolbar>
          <IconButton
            size="large"
            edge="start"
            color="inherit"
            aria-label="menu"
            sx={{ mr: 2 }}
            onClick={toggleSlider}
          >
            <MenuIcon />
          </IconButton>
          <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            My Portfolio
          </Typography>
          <Drawer open={isDrawerOpen} onClose={toggleSlider}>
            <ListItems toggleSlider={toggleSlider} />
          </Drawer>
          <UserProfile />
        </Toolbar>
      </AppBar>
    </Box>
  );
};
