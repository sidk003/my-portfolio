import { React } from "react";
import { Link, Typography } from "@mui/material";
import { GITHUB_URL } from "../../Constants";

export const Footer = (props) => {
  return (
    <Typography
      variant="body2"
      color="text.secondary"
      align="center"
      {...props}
    >
      {"Copyright © "}
      <Link color="inherit" href={GITHUB_URL}>
        Siddhant Kulshrestha
      </Link>{" "}
      {new Date().getFullYear()}
      {"."}
    </Typography>
  );
};
