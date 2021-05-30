package com.RepoM.RepositoryManager.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.RepoM.RepositoryManager.Model.GenericErrorModel;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler({CategoryNotFound.class})
	public ResponseEntity<GenericErrorModel> categoryNotFoundException(CategoryNotFound categoryNotFound)
	{
		
		return new ResponseEntity<>(new GenericErrorModel(404,"Category Not Found",System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<GenericErrorModel> productNotFoundException(ProductNotFoundException productNotFound)
	{
		
		return new ResponseEntity<>(new GenericErrorModel(404,"Product Not Found",System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<GenericErrorModel> UserNotFoundException(UserNotFoundException userNotFound)
	{
		
		return new ResponseEntity<>(new GenericErrorModel(404,"User Not Found",System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidBuyQuantityException.class)
	public ResponseEntity<GenericErrorModel> InvalidBuyQuantity(InvalidBuyQuantityException invalidQuanity)
	{
		
		return new ResponseEntity<>(new GenericErrorModel(400,"Quantity Invalid",System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmptyJsonException.class)
	public ResponseEntity<GenericErrorModel> EmptyJSONException(EmptyJsonException emptyJSON)
	{
		
		return new ResponseEntity<>(new GenericErrorModel(400,"Enter a Valid JSON DATA",System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}



}
