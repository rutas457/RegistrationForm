<html xmlns:th="http://www.thymeleaf.org">
<style>
    @import "style_reg.css";
</style>


<div class="login-page">
    <div class="form">
        <form action="#" method="post" >
            <h2>${msg}</h2>
            <input type="text" name="login" placeholder="email"/>
            <input type="password" name="password" placeholder="password"/>
            <button type="submit">login</button>
            <p class="message"> <a href="http://localhost:8080/reg">Create an account</a></p>
        </form>

    </div>
</div>
