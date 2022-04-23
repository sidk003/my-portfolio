import { makeStyles } from "@mui/styles";

const primaryColor = "#4D6FE5";

export default makeStyles(() => ({
  container: {
    font: "Nunito",
    backgroundColor: primaryColor,
    textAlign: "center",
    color: "#fff",
    marginTop: "100px",
  },
  header: {
    fontSize: "1.3rem",
    margin: "0 auto 60px auto",
    position: "relative",
    height: "25px",
    width: "250px",
    overflow: "hidden",
  },
  headerHeading: {
    display: "flex",
    flexDirection: "column",
    position: "absolute",
    width: "100%",
    transition: "all .4s cubic-beizer(.785,.135,.15,.86)",
    transform: "translateY(0)",
  },
}));
