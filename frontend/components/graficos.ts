import Chart from "chart.js/auto";

const ctx = document.getElementById("myChart") as HTMLCanvasElement;
new Chart(ctx, {
  type: "bar",
  data: {
    labels: ["Red", "Blue", "Yellow"],
    datasets: [
      {
        label: "Votes",
        data: [12, 19, 3],
        backgroundColor: ["red", "blue", "yellow"],
      },
    ],
  },
});
