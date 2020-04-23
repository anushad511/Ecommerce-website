<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Products</title>

    <link href="style.css" rel="stylesheet">
</head>

<body>
    <header>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.html" class="navbar-brand"><b>AngelAnu stores</b></a>
                </div>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="nav navbar-nav navbar-right">

                        <li><a href="showcart.jsp"><span class="glyphicon glyphicon-shopping-cart">Cart</span></a></li>
                      
                        <li><a href="index.html"><span class="glyphicon glyphicon-log-out">Logout</span></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
<main>
        <div class="container">
            <div class="row row_style">
                <div class="col-xs-5 col-lg-offset-2">
                    <form action="cartdb.jsp" method="post">
                        <h2>Enter Product Details here</h2>
                        <div class="form-group">
                            <label for="pid"><h4>Choose the pid: </h4></label>
  <select id="pid" name="pid">
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
     </select>
                        </div>
                        <div class="form-group">
                          <label for="product name"><h4>Choose the product name: </h4></label>
  <select id="pname" name="pname">
    <option value="Nikon NX21">Nikon NX21</option>
        <option value="Burberry">Burberry</option>
    <option value="One Plus 7t">One Plus 7t</option>
    <option value="Audio Technica">Audio Technica</option>
    <option value="Titan Raga">Titan Raga</option>
    <option value="Priya Earings collections">Priya Earings collections</option>

        <option value="Marie Claire">Marie Claire</option>

            <option value="Diesel 3bar">Diesel 3bar</option>

                <option value="The Wishing Chair">The Wishing Chair</option>

                    <option value="Homebase Kitchens">Homebase Kitchens</option>

                        <option value="Allen Solly">Allen Solly</option>

                            <option value="Deepam sarees">Deepam sarees</option>
  </select>
    
                        </div>
                        <div class="form-group">
                           <label for="product price"><h4>Choose the product price: </h4></label>
  <select id="price" name="price">
    <option value="36000">36000</option>
    <option value="10000">10000</option>
    <option value="40000">40000</option>
    <option value="12000">12000</option>
    <option value="7000">7000</option>
    <option value="600">600</option>
    <option value="3000">3000</option>
    <option value="3300">3300</option>
    <option value="36000">36000</option>
    <option value="5000">5000</option>
    <option value="2900">2900</option>
        <option value="3000">3000</option>
  </select>
                        </div>
                      
                       <button class="btn btn-primary">Add to cart</button>
                    </form>
                </div>



            </div>


        </div>
    </main>
   