<html xmlns:th="http://www.thymeleaf.org">
<style>
    @import "style_reg.css";
</style>
<#import "/spring.ftl" as spring />


<div class="login-page">
    <div class="form">

        <form class="login-form" action="#" method="post">
            Full Name:<br>
            <@spring.formInput "user.fullName"/>
            <@spring.showErrors "<br>"/>
            <br><br>
            Email:<br>
            <@spring.formInput "user.email" />
            <@spring.showErrors "<br>"/>
            <br><br>
            Password:<br>
            <@spring.formInput "user.password"/>
            <@spring.showErrors "<br>"/>
            <br><br>
            <button type="submit">create</button>
            <p class="message">Already registered? <a href="http://localhost:8080/">Sign In</a></p>
        </form>
    </div>
</div>
