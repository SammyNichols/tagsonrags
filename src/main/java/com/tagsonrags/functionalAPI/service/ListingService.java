package com.tagsonrags.functionalAPI.service;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagsonrags.functionalAPI.entity.Article;
import com.tagsonrags.functionalAPI.entity.Listing;
import com.tagsonrags.functionalAPI.entity.User;
import com.tagsonrags.functionalAPI.repository.ArticleRepository;
import com.tagsonrags.functionalAPI.repository.ListingRepository;
import com.tagsonrags.functionalAPI.repository.UserRepository;
import com.tagsonrags.functionalAPI.util.ListingStatus;

@Service
public class ListingService {
	
//	private static final Logger logger = LogManager.getLogger(ListingService.class);
//	
//	@Autowired
//	private ListingRepository repo;
//	
//	@Autowired
//	private UserRepository userRepo;
//	
//	@Autowired
//	private ArticleRepository articleRepo;
//	
//	public Listing createNewListing(Set<Long> articleIds, Long userId) throws Exception {
//		try {
//			User user = userRepo.findOne(userId);
//			Listing listing = generateNewListing(articleIds, user);
//			return repo.save(listing);
//		} catch (Exception e) {
//			logger.error("Exception occured while trying to save new Listing for user ID: " + userId);
//			throw e;
//		}
//	}
//	
//	public Listing cancelListing(Long listingId) throws Exception {
//		try {
//			Listing listing = repo.findOne(listingId);
//			listing.setStatus(ListingStatus.CLOSED);
//			return repo.save(listing);
//		} catch (Exception e) {
//			logger.error("Exception occured while trying to cancel listing: " + listingId);
//			throw new Exception("Unable to update listing.");
//		}
//	}
//	
//	public Listing completedExchange(Long listingId) throws Exception {
//		try {
//			Listing listing = repo.findOne(listingId);
//			listing.setStatus(ListingStatus.DELIVERED);
//			return repo.save(listing);
//		} catch (Exception e) {
//			logger.error("Exception occurred while trying to update listing number: " + listingId);
//			throw new Exception("Unable to update Listing.");
//		}
//	}
//	
//	private Listing generateNewListing(Set<Long> articleIds, User user) {
//		Listing listing = new Listing();
//		listing.setLister(user);
//		listing.setArticle(generateArticleSet(articleRepo.findAll(articleIds)));
//		listing.setStatus(ListingStatus.PENDING);
//		listing.setTotal(calculateExchangePrice(listing.getArticle()));
//		return listing;
//	}
//
//	private double calculateExchangePrice(Set<Article> article) {
//		double total = 0;
//		for (Article price : article) {
//			total += price.getPrice();
//		}
//		return total;
//	}
//
//	private Set<Article> generateArticleSet(Iterable<Article> findAll) {
//		Set<Article> set = new HashSet<Article>();
//		for (Article article : findAll) {
//			set.add(article);
//		}
//		return set;
//	}
}
