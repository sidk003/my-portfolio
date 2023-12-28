import {
  Box,
  List,
  ListItemText,
  ListItemIcon,
  ListItemButton,
} from "@mui/material";
import DashboardIcon from "@mui/icons-material/Dashboard";
import ShowChartIcon from "@mui/icons-material/ShowChart";
import PercentIcon from "@mui/icons-material/Percent";
import DiamondIcon from "@mui/icons-material/Diamond";
import AccountBalanceIcon from "@mui/icons-material/AccountBalance";
import { Link } from "react-router-dom";

const listItems = [
  {
    listIcon: <PercentIcon />,
    listText: "Mutual Funds",
  },
  {
    listIcon: <ShowChartIcon />,
    listText: "Stocks",
  },
  {
    listIcon: <AccountBalanceIcon />,
    listText: "Fixed Income",
  },
  {
    listIcon: <DiamondIcon />,
    listText: "Commodities",
  },
];

export const ListItems = ({ toggleSlider }) => {
  return (
    <Box component="div" sx={{ minWidth: 250 }}>
      <Link to="/homePage" style={{ color: "white", textDecoration: "none" }}>
        <ListItemButton onClick={toggleSlider} divider>
          <ListItemIcon>
            <DashboardIcon />
          </ListItemIcon>
          <ListItemText>Dashboard</ListItemText>
        </ListItemButton>
      </Link>
      <List>
        {listItems.map((listItem, index) => (
          <ListItemButton key={index}>
            <ListItemIcon>{listItem.listIcon}</ListItemIcon>
            <ListItemText primary={listItem.listText} />
          </ListItemButton>
        ))}
      </List>
    </Box>
  );
};
