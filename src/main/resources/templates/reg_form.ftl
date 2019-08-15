<html xmlns:th="http://www.thymeleaf.org">
<style>
    @import "style_reg.css";
</style>


<div class="login-page">
    <div class="form">
        <form class="login-form" action="#" method="post">
            <input type="text" name="name" placeholder="full name"/>
            <input type="text" name="email" placeholder="email address"/>
            <input type="password" name="password" placeholder="password"/>
            <button>create</button>
            <p class="message">Already registered? <a href="javascript:history.back()">Sign In</a></p>
        </form>
    </div>
</div>
