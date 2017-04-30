# backback

Backend for mapmap, forked from https://github.com/conveyal/transit-wand

## Tecnology

* Java 1.7 (if you upgrade to java 8 this will happen: http://stackoverflow.com/questions/26480213/java-8-spliterator-iterator-collection-and-default-implemenations-in-interf)
* Postgresql + PostGIS
* Play framework 1.2.5 https://playframework.com/documentation/1.2.x/home
	- download and extract Play 1.2.5 https://playframework.com/download#alternatives
	- add the `play` command to your PATH

## Configure and develop

* install everything listed in the Tecnology section above
* `git clone`
* create database in postgresql (https://wiki.archlinux.org/index.php/PostgreSQL#Create_your_first_database.2Fuser)
* add postgis extension to created database (https://wiki.archlinux.org/index.php/PostGIS#Installing_PostGIS_Extension)
* copy `conf/application.conf.sample` to `conf/application.conf` and edit the DB connection params
* run `play run` inside the repo, this will create the tables

## Contributing

See CONTRIBUTING.md
