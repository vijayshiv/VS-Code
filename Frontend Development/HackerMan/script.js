const sarthak = async () => {
  reset();
  let h1 = () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve("Initializing Hacking...");
      }, 1000);
    });
  };
  let h2 = () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve(`Hacking Sarthak's Username...`);
      }, 1000);
    });
  };
  let h3 = () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve("Username found Jaat_Sarthak...");
      }, 1000);
    });
  };
  let h4 = () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve("Connecting to Facebook Account of Sarthak Singh..");
      }, 1000);
    });
  };
  let h5 = () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve("Facebook Account of Sarthak Singh have been Hacked‼");
      }, 1000);
    });
  };
  let p1 = await h1();
  document.getElementById("div1").innerHTML = p1;
  let p2 = await h2();
  document.getElementById("div2").innerHTML = p2;
  let p3 = await h3();
  document.getElementById("div3").innerHTML = p3;
  let p4 = await h4();
  document.getElementById("div4").innerHTML = p4;
  let p5 = await h5();
  document.getElementById("div5").innerHTML = p5;
};
const aditya = async () => {
  reset();
  let h1 = () => {
    setTimeout(() => {
      document.getElementById("div1").innerHTML = "Initializing Hacking...";
    }, 3000);
  };
  let h2 = () => {
    setTimeout(() => {
      document.getElementById("div2").innerHTML = "Hacking Aditya's Username...";
    }, 5000);
  };
  let h3 = () => {
    setTimeout(() => {
      document.getElementById("div3").innerHTML = "Username found Aditya_aggrawal...";
    }, 7000);
  };
  let h4 = () => {
    setTimeout(() => {
      document.getElementById("div4").innerHTML =
        "Connecting to Facebook Account of Aditya Aggrawal..";
    }, 9000);
  };
  let h5 = () => {
    setTimeout(() => {
      document.getElementById("div5").innerHTML =
        "Facebook Account of Aditya Aggrawal have been Hacked🤑‼";
    }, 11000);
  };
  await h1();
  await h2();
  await h3();
  await h4();
  await h5();
};
const reset = () => {
  document.getElementById("div1").innerHTML = "";
  document.getElementById("div2").innerHTML = "";
  document.getElementById("div3").innerHTML = "";
  document.getElementById("div4").innerHTML = "";
  document.getElementById("div5").innerHTML = "";
};
