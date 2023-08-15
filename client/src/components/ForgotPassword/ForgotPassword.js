import { React, useCallback } from "react";
import {
  Avatar,
  Button,
  Typography,
  CssBaseline,
  TextField,
  Box,
  Container,
  Grid,
} from "@mui/material";
import LockResetIcon from "@mui/icons-material/LockReset";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import { Footer } from "../Footer/Footer";
import { Link } from "react-router-dom";

const theme = createTheme();

export const ForgotPassword = (props) => {
  const handleSubmit = useCallback((event) => {
    event.preventDefault();
    const data = new FormData(event.currentTarget);
    const emailId = data.get("email");
    console.log(`Email sent to ${emailId} successfully!`);
  }, []);

  return (
    <ThemeProvider theme={theme}>
      <Container component="main" maxWidth="sm">
        <CssBaseline />
        <Box
          display="flex"
          flexDirection="column"
          alignItems="center"
          sx={{ mt: 8 }}
        >
          <Avatar sx={{ m: 1, bgcolor: "secondary.main" }}>
            <LockResetIcon />
          </Avatar>
          <Typography component="h1" variant="h4">
            Reset your password
          </Typography>
          <Typography variant="h7">
            Enter your email address and we will send you a new password
          </Typography>
          <Box
            component="form"
            noValidate
            onSubmit={handleSubmit}
            sx={{ mt: 1 }}
          >
            <TextField
              margin="normal"
              required
              fullWidth
              id="email"
              label="Email Address"
              name="email"
              autoComplete="email"
              autoFocus
            />

            <Button
              type="submit"
              fullWidth
              variant="contained"
              sx={{ mt: 3, mb: 2 }}
            >
              Send Email
            </Button>

            <Grid container spacing={3} alignItems="baseline">
              <Grid item xs={6} justifyContent="flex-start">
                <Link to="/">Sign in</Link>
              </Grid>
              <Grid item xs={6} display="flex" justifyContent="flex-end">
                <Link to="/signUp">Sign Up</Link>
              </Grid>
            </Grid>

            <Footer sx={{ mt: 5 }} />
          </Box>
        </Box>
      </Container>
    </ThemeProvider>
  );
};
