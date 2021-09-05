package com.jspider2.Hibernate2;

import com.jspider2.Hibernate2.dao.HqlMovieDao;

import com.jspider2.Hibernate2.dao.MovieDao;
import com.jspider2.Hibernate2.dto.MovieDto;
import com.jspider2.Hibernate2.entity.Brand;
import com.jspider2.Hibernate2.entity.College;
import com.jspider2.Hibernate2.entity.Model;
import com.jspider2.Hibernate2.entity.Movie;
import com.jspider2.Hibernate2.entity.Passport;
import com.jspider2.Hibernate2.entity.Person;
import com.jspider2.Hibernate2.entity.Students;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jspider2.Hibernate2.dao.AssociationDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Movie movie = new Movie();
    	//movie.setId(123);
    	movie.setName("Bahubali");
    	movie.setLanguage("universal");
    	movie.setPrice(250.50);
    	movie.setDuration("2.5hrs");
    	movie.setRatings("5.0");
    	
    	MovieDao movieDao = new MovieDao();
    	//movieDao.saveMovieDetails(movie);
    	Movie movieFromdb = movieDao.getMovieById(125);
    	System.out.println(movieFromdb);
    	//MovieDto movieDto = new MovieDto();
    	//movieDto.setPrice(350.50);
    	//movieDto.setRatings("1.5");
    	//movieDao.updateMovieById(movieDto, 123);
    	//HqlMovieDao dao = new HqlMovieDao();
		
		  //dao.getMovies().forEach(each ->{ System.out.println(each); });
		 
    	//Movie movieById = dao.getMovieById(125);
    	//System.out.println(movieById);
    	
    	//dao.updateMovieByName("Telugu", "Bahubali");
    	//dao.deleteMovieById(123);
    	/*Passport passport = new Passport();
    	passport.setPassportNumber("NHIND123456");
    	passport.setNationality("Indian");
    	
    	
    	Person person = new Person();
    	person.setName("prajwal");
    	person.setAge(23);
    	person.setEmail("prajwal@domain.com");
    	person.setMobileNumber("9182679947");
    	person.setPassport(passport);*/
    	
    	AssociationDao dao = new AssociationDao();
    	//dao.savePersonDetails(person);
    	
    	//one to many relationship
    	
		/*Brand brand = new Brand();
		brand.setName("Mahindra");
		brand.setStartedYear(new Date());
		brand.setFeatures("Good Quality");
		brand.setOriginCountry("India");
		brand.setType("cars");
		
		Model model = new Model();
		model.setName("scorpio");
		model.setColor("bloack");
		model.setPrice(120.00);
		model.setManufactureDate(new Date());
		model.setCategory("suv");
		
		Model model1 = new Model();
		model1.setName("xuv-600");
		model1.setColor("white");
		model1.setPrice(140.00);
		model1.setManufactureDate(new Date());
		model.setCategory("suv");
		
		List<Model> list = new ArrayList<Model>();
		list.add(model);
		list.add(model1);
		
		brand.setModels(list);
		
		dao.saveBrandDetails(brand);*/
    	
    	//ManyToOne
    	
    	College clg=new College();
    	//clg.setId(17985);
    	clg.setCollage_name("Raghu Engineering College");
    	clg.setCollege_place("Visakhapatnam");
    	clg.setNo_of_vacancies(999);
    	 
    	Students s1=new Students();
    	s1.setName("Naveen");
    	s1.setAge(22);
    	s1.setBranch("EEE");
    	s1.setMobile(628116289);
    	
    	Students s2=new Students();
    	s2.setName("Sridhar");
    	s2.setAge(22);
    	s2.setBranch("ECE");
    	s2.setMobile(628116289);
    	
    	s2.setClgg(clg);
    	s1.setClgg(clg);
    	
    	
    	dao.saveStudentDetails(s1);
    	dao.saveStudentDetails(s2);
    	
    	


    }
}
