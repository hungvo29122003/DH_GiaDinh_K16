<template>
  <!-- <Home /> -->
  <Header />
  <!-- <Product /> -->
  <Footer />
</template>

<script>
// muốn gọi component thì import, 2 - đăng ký component
// import Home from "./components/ComHome.vue";
import Header from "./components/ComHeader.vue";
import Footer from "./components/ComFooter.vue";
// import Product from "./components/ComProduct.vue";
export default {
  name: "App",
  // đăng ký components
  components: {
    // Home,
    Header,
    // Product,
    Footer,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
