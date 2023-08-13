import "./App.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import { Login } from "./components/Login/Login";
import { LandingPage } from "./components/LandingPage/LandingPage";
import { SignUp } from "./components/SignUp/SignUp";
import { ForgotPassword } from "./components/ForgotPassword/ForgotPassword";

const App = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/" Component={Login} />
        <Route exact path="forgotPassword" Component={ForgotPassword} />
        <Route exact path="/landingPage" Component={LandingPage} />
        <Route exact path="/signUp" Component={SignUp} />
      </Routes>
    </Router>
  );
};

export default App;
