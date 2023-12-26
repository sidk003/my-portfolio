import { React } from "react";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import CssBaseline from "@mui/material/CssBaseline";
import { TopBar } from "../TopBar/TopBar";

export const HomePage = (props) => {
  const theme = createTheme({
    palette: {
      mode: "dark",
    },
  });

  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <TopBar />
    </ThemeProvider>
  );
};
