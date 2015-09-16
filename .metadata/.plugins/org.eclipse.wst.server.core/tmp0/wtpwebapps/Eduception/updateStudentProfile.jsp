<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
</head>

<f:view>
<body class="blurBg-false" style="background-color:#EBEBEB">



<!-- Start Formoid form-->
<link rel="stylesheet" href="files/formoid1/formoid-solid-blue.css" type="text/css" />
<script type="text/javascript" src="login_files/formoid1/jquery.min.js"></script>
<script type="text/javascript" src="login_files/formoid1/formoid-solid-blue.js"></script>

<h:form styleClass="formoid-solid-blue" style="background-color:#FFFFFF;font-size:14px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:1000px;min-width:600px" >
<div class="title">
	<h2>Edit Profile</h2>
</div>
	<div class="element-name" title="Name">
		<label class="title"><span class="required">*</span></label>
		<span class="nameFirst"><h:inputText value="#{controller.studentProfileDetails.firstName}"></h:inputText><span class="icon-place"></span></span>
		<span class="nameLast"><h:inputText value="#{controller.studentProfileDetails.lastName}"></h:inputText><span class="icon-place"></span></span>
	</div>
	<div class="element-email">
		<label class="title"><span class="required">*</span></label>
		<div class="item-cont">
			<h:inputText value="#{controller.studentProfileDetails.emailId}"></h:inputText><span class="icon-place">
			<span class="icon-place"></span>
		</div>
	</div>
	<div class="element-file" title="Display picture">
		<label class="title"><span class="required">*</span></label>
		<div class="item-cont"><label class="medium" ><div class="button">Choose picture</div>
			<h:inputFile value="#{controller.studentProfileDetails.displayPicture}"></h:inputFile><span class="icon-place">
			<span class="icon-place"></span>
		</div>
	</div>
	<div class="element-address" title="Address">
		<span class="streetAddress"><h:inputText value="#{controller.studentProfileDetails.streetAddress}"></h:inputText><span class="icon-place"></span></span>
		<span class="addressLine2"><h:inputText value="#{controller.studentProfileDetails.addressLine2}"></h:inputText><span class="icon-place"></span></span>
	</div>
	<div class="element-Phone">
		<div class="item-cont">
			<h:inputText value="#{controller.studentProfileDetails.phone}"></h:inputText><span class="icon-place">
			<span class="icon-place"></span>
		</div>
	</div>
	<div class="element-gender">
		<label class="title"><span class="required">*</span></label>
		<div class="item-cont">
			<h:inputText value="#{controller.studentProfileDetails.emailId}"></h:inputText><span class="icon-place">
			<span class="icon-place"></span>
		</div>
	</div>
	<div class="element-email">
		<label class="title"><span class="required">*</span></label>
		<div class="item-cont">
			<h:inputText value="#{controller.studentProfileDetails.emailId}"></h:inputText><span class="icon-place">
			<span class="icon-place"></span>
		</div>
	</div>
	
	
	
	<div class="submit">
		<h:commandButton action="#{controller.saveStudentProfileDetailsJPA}" value="Save"></h:commandButton>
	</div>
</h:form>

</f:view>
<div class="element-input" title="university"><label class="title"></label><div class="item-cont"><input class="large" type="text" name="input" placeholder="Search people, company, university"/><span class="icon-place"></span></div></div>
	
	
	
	<div class="element-address"><label class="title"></label><span class="addr1"><input placeholder="Street Address" type="text" name="address[addr1]" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address[addr2]" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="address[city]" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="address[state]" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="address[zip]" /><span class="icon-place"></span></span><div class="country"><select name="address[country]" ><option selected="selected" value="" disabled="disabled">--- Select a country ---</option><option value="United States">United States</option><option value="United Kingdom">United Kingdom</option><option value="Australia">Australia</option><option value="Canada">Canada</option><option value="France">France</option><option value="New Zealand">New Zealand</option><option value="India">India</option><option value="Brazil">Brazil</option><option value="----" disabled="disabled">----</option><option value="Afghanistan">Afghanistan</option><option value="Aland Islands">Aland Islands</option><option value="Albania">Albania</option><option value="Algeria">Algeria</option><option value="American Samoa">American Samoa</option><option value="Andorra">Andorra</option><option value="Angola">Angola</option><option value="Anguilla">Anguilla</option><option value="Antarctica">Antarctica</option><option value="Antigua and Barbuda">Antigua and Barbuda</option><option value="Argentina">Argentina</option><option value="Armenia">Armenia</option><option value="Aruba">Aruba</option><option value="Austria">Austria</option><option value="Azerbaijan">Azerbaijan</option><option value="Bahamas">Bahamas</option><option value="Bahrain">Bahrain</option><option value="Bangladesh">Bangladesh</option><option value="Barbados">Barbados</option><option value="Belarus">Belarus</option><option value="Belgium">Belgium</option><option value="Belize">Belize</option><option value="Benin">Benin</option><option value="Bermuda">Bermuda</option><option value="Bhutan">Bhutan</option><option value="Bolivia">Bolivia</option><option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option><option value="Botswana">Botswana</option><option value="British Indian Ocean Territory">British Indian Ocean Territory</option><option value="Brunei Darussalam">Brunei Darussalam</option><option value="Bulgaria">Bulgaria</option><option value="Burkina Faso">Burkina Faso</option><option value="Burundi">Burundi</option><option value="Cambodia">Cambodia</option><option value="Cameroon">Cameroon</option><option value="Cape Verde">Cape Verde</option><option value="Cayman Islands">Cayman Islands</option><option value="Central African Republic">Central African Republic</option><option value="Chad">Chad</option><option value="Chile">Chile</option><option value="China">China</option><option value="Colombia">Colombia</option><option value="Comoros">Comoros</option><option value="Democratic Republic of the Congo">Democratic Republic of the Congo</option><option value="Republic of the Congo">Republic of the Congo</option><option value="Cook Islands">Cook Islands</option><option value="Costa Rica">Costa Rica</option><option value="Cote d'Ivoire">Cote d'Ivoire</option><option value="Croatia">Croatia</option><option value="Cuba">Cuba</option><option value="Cyprus">Cyprus</option><option value="Czech Republic">Czech Republic</option><option value="Denmark">Denmark</option><option value="Djibouti">Djibouti</option><option value="Dominica">Dominica</option><option value="Dominican Republic">Dominican Republic</option><option value="East Timor">East Timor</option><option value="Ecuador">Ecuador</option><option value="Egypt">Egypt</option><option value="El Salvador">El Salvador</option><option value="Equatorial Guinea">Equatorial Guinea</option><option value="Eritrea">Eritrea</option><option value="Estonia">Estonia</option><option value="Ethiopia">Ethiopia</option><option value="Faroe Islands">Faroe Islands</option><option value="Fiji">Fiji</option><option value="Finland">Finland</option><option value="Gabon">Gabon</option><option value="Gambia">Gambia</option><option value="Georgia">Georgia</option><option value="Germany">Germany</option><option value="Ghana">Ghana</option><option value="Gibraltar">Gibraltar</option><option value="Greece">Greece</option><option value="Grenada">Grenada</option><option value="Guatemala">Guatemala</option><option value="Guinea">Guinea</option><option value="Guinea-Bissau">Guinea-Bissau</option><option value="Guyana">Guyana</option><option value="Haiti">Haiti</option><option value="Honduras">Honduras</option><option value="Hong Kong">Hong Kong</option><option value="Hungary">Hungary</option><option value="Iceland">Iceland</option><option value="Indonesia">Indonesia</option><option value="Iran">Iran</option><option value="Iraq">Iraq</option><option value="Ireland">Ireland</option><option value="Israel">Israel</option><option value="Italy">Italy</option><option value="Jamaica">Jamaica</option><option value="Japan">Japan</option><option value="Jordan">Jordan</option><option value="Kazakhstan">Kazakhstan</option><option value="Kenya">Kenya</option><option value="Kiribati">Kiribati</option><option value="North Korea">North Korea</option><option value="South Korea">South Korea</option><option value="Kuwait">Kuwait</option><option value="Kyrgyzstan">Kyrgyzstan</option><option value="Laos">Laos</option><option value="Latvia">Latvia</option><option value="Lebanon">Lebanon</option><option value="Lesotho">Lesotho</option><option value="Liberia">Liberia</option><option value="Libya">Libya</option><option value="Liechtenstein">Liechtenstein</option><option value="Lithuania">Lithuania</option><option value="Luxembourg">Luxembourg</option><option value="Macedonia">Macedonia</option><option value="Madagascar">Madagascar</option><option value="Malawi">Malawi</option><option value="Malaysia">Malaysia</option><option value="Maldives">Maldives</option><option value="Mali">Mali</option><option value="Malta">Malta</option><option value="Marshall Islands">Marshall Islands</option><option value="Mauritania">Mauritania</option><option value="Mauritius">Mauritius</option><option value="Mexico">Mexico</option><option value="Micronesia">Micronesia</option><option value="Moldova">Moldova</option><option value="Monaco">Monaco</option><option value="Mongolia">Mongolia</option><option value="Montenegro">Montenegro</option><option value="Morocco">Morocco</option><option value="Mozambique">Mozambique</option><option value="Myanmar">Myanmar</option><option value="Namibia">Namibia</option><option value="Nauru">Nauru</option><option value="Nepal">Nepal</option><option value="Netherlands">Netherlands</option><option value="Netherlands Antilles">Netherlands Antilles</option><option value="Nicaragua">Nicaragua</option><option value="Niger">Niger</option><option value="Nigeria">Nigeria</option><option value="Norway">Norway</option><option value="Oman">Oman</option><option value="Pakistan">Pakistan</option><option value="Palau">Palau</option><option value="Palestine">Palestine</option><option value="Panama">Panama</option><option value="Papua New Guinea">Papua New Guinea</option><option value="Paraguay">Paraguay</option><option value="Peru">Peru</option><option value="Philippines">Philippines</option><option value="Poland">Poland</option><option value="Portugal">Portugal</option><option value="Puerto Rico">Puerto Rico</option><option value="Qatar">Qatar</option><option value="Romania">Romania</option><option value="Russia">Russia</option><option value="Rwanda">Rwanda</option><option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option><option value="Saint Lucia">Saint Lucia</option><option value="Saint Vincent and the Grenadines">Saint Vincent and the Grenadines</option><option value="Samoa">Samoa</option><option value="San Marino">San Marino</option><option value="Sao Tome and Principe">Sao Tome and Principe</option><option value="Saudi Arabia">Saudi Arabia</option><option value="Senegal">Senegal</option><option value="Serbia">Serbia</option><option value="Seychelles">Seychelles</option><option value="Sierra Leone">Sierra Leone</option><option value="Singapore">Singapore</option><option value="Slovakia">Slovakia</option><option value="Slovenia">Slovenia</option><option value="Solomon Islands">Solomon Islands</option><option value="Somalia">Somalia</option><option value="South Africa">South Africa</option><option value="Spain">Spain</option><option value="Sri Lanka">Sri Lanka</option><option value="Sudan">Sudan</option><option value="Suriname">Suriname</option><option value="Swaziland">Swaziland</option><option value="Sweden">Sweden</option><option value="Switzerland">Switzerland</option><option value="Syria">Syria</option><option value="Taiwan">Taiwan</option><option value="Tajikistan">Tajikistan</option><option value="Tanzania">Tanzania</option><option value="Thailand">Thailand</option><option value="Togo">Togo</option><option value="Tonga">Tonga</option><option value="Trinidad and Tobago">Trinidad and Tobago</option><option value="Tunisia">Tunisia</option><option value="Turkey">Turkey</option><option value="Turkmenistan">Turkmenistan</option><option value="Tuvalu">Tuvalu</option><option value="Uganda">Uganda</option><option value="Ukraine">Ukraine</option><option value="United Arab Emirates">United Arab Emirates</option><option value="United States Minor Outlying Islands">United States Minor Outlying Islands</option><option value="Uruguay">Uruguay</option><option value="Uzbekistan">Uzbekistan</option><option value="Vanuatu">Vanuatu</option><option value="Vatican City">Vatican City</option><option value="Venezuela">Venezuela</option><option value="Vietnam">Vietnam</option><option value="Virgin Islands, British">Virgin Islands, British</option><option value="Virgin Islands, U.S.">Virgin Islands, U.S.</option><option value="Yemen">Yemen</option><option value="Zambia">Zambia</option><option value="Zimbabwe">Zimbabwe</option></select><i></i><span class="icon-place"></span></div></div>
	<div class="element-phone"><label class="title"></label><div class="item-cont"><input class="small" type="tel" pattern="[+]?[\.\s\-\(\)\*\#0-9]{3,}" maxlength="24" name="phone" placeholder="Phone" value=""/><span class="icon-place"></span></div></div>
	<div class="element-radio" title="gender"><label class="title">Gender<span class="required">*</span></label>		<div class="column column3"><label><input type="radio" name="radio" value="Male" required="required"/><span>Male</span></label></div><span class="clearfix"></span>
		<div class="column column3"><label><input type="radio" name="radio" value="Female" required="required"/><span>Female</span></label></div><span class="clearfix"></span>
		<div class="column column3"><label><input type="radio" name="radio" value="Others" required="required"/><span>Others</span></label></div><span class="clearfix"></span>
</div>
	<div class="element-separator"><hr><h3 class="section-break-title">Education</h3></div>
	<div class="element-select" title="degree"><label class="title"><span class="required">*</span></label><div class="item-cont"><div class="small"><span><select name="select2" required="required">

		<option value="Master of Science">Master of Science</option>
		<option value="Master of Business Administration">Master of Business Administration</option>
		<option value="Bachelor of Technology">Bachelor of Technology</option></select><i></i><span class="icon-place"></span></span></div></div></div>
	<div class="element-select"><label class="title"><span class="required">*</span></label><div class="item-cont"><div class="small"><span><select name="select1" required="required">

		<option value="Management Information Systems">Management Information Systems</option>
		<option value="Computer Science">Computer Science</option>
		<option value="other">other</option></select><i></i><span class="icon-place"></span></span></div></div></div>
	<div class="element-select"><label class="title"><span class="required">*</span></label><div class="item-cont"><div class="small"><span><select name="select" required="required">

		<option value="Texas A&M">Texas A&M</option>
		<option value="Harvard">Harvard</option>
		<option value="JNTU">JNTU</option></select><i></i><span class="icon-place"></span></span></div></div></div>
	<div class="element-input" title="CGPA"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input1" required="required" placeholder="CGPA"/><span class="icon-place"></span></div></div>
	<div class="element-date" title="start date"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" data-format="yyyy-mm-dd" type="date" name="date" required="required" placeholder="Start Date"/><span class="icon-place"></span></div></div>
	<div class="element-date" title="End date"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" data-format="yyyy-mm-dd" type="date" name="date1" required="required" placeholder="End date"/><span class="icon-place"></span></div></div>
	<div class="element-separator" title="Work Experience"><hr><h3 class="section-break-title">Work Experience</h3></div>
	<div class="element-input" title="Job Title"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input2" required="required" placeholder="Job Title"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="Company"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input3" required="required" placeholder="Company"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="Manager/Supervisor Name"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input4" required="required" placeholder="Manager/Supervisor Name"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="Manager/Supervisor Title"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input5" required="required" placeholder="Manager/Supervisor Title"/><span class="icon-place"></span></div></div>
	<div class="element-date" title="Start Date"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" data-format="yyyy-mm-dd" type="date" name="date2" required="required" placeholder="Start Date"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="End Date"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input6" required="required" placeholder="End Date"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="Project Name"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="small" type="text" name="input7" required="required" placeholder="Project Name"/><span class="icon-place"></span></div></div>
	<div class="element-textarea" title="Project Description"><label class="title"></label><div class="item-cont"><textarea class="medium" name="textarea" cols="20" rows="5" placeholder="Project Description"></textarea><span class="icon-place"></span></div></div>
	<div class="element-separator" title="Awards"><hr><h3 class="section-break-title">Awards</h3></div>
	<div class="element-input" title="Award Title"><label class="title"></label><div class="item-cont"><input class="small" type="text" name="input8" placeholder="Award Title"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="Issuer"><label class="title"></label><div class="item-cont"><input class="small" type="text" name="input9" placeholder="Issuer"/><span class="icon-place"></span></div></div>
	<div class="element-textarea" title="Description"><label class="title"></label><div class="item-cont"><textarea class="medium" name="textarea1" cols="20" rows="5" placeholder="Description"></textarea><span class="icon-place"></span></div></div>
	<div class="element-separator" title="Leadership"><hr><h3 class="section-break-title">Leadership</h3></div>
	<div class="element-input" title="Position Title"><label class="title"></label><div class="item-cont"><input class="small" type="text" name="input10" placeholder="Position Title"/><span class="icon-place"></span></div></div>
	<div class="element-input" title="Organization"><label class="title"></label><div class="item-cont"><input class="small" type="text" name="input11" placeholder="Organization"/><span class="icon-place"></span></div></div>
	<div class="element-textarea" title="Description"><label class="title"></label><div class="item-cont"><textarea class="medium" name="textarea2" cols="20" rows="5" placeholder="Description"></textarea><span class="icon-place"></span></div></div>
	<div class="element-separator" title="Skills"><hr><h3 class="section-break-title">Skills</h3></div>
	<div class="element-input" title="Skills"><label class="title"></label><div class="item-cont"><input class="small" type="text" name="input12" placeholder="add skills..."/><span class="icon-place"></span></div></div>
<div class="submit"><input type="submit" value="Save"/></div></form><p class="frmd"><a href="http://formoid.com/v29.php">jquery form validation</a> Formoid.com 2.9</p><script type="text/javascript" src="editstudentprofile_files/formoid1/formoid-solid-blue.js"></script>
<!-- Stop Formoid form-->



</body>
</html>