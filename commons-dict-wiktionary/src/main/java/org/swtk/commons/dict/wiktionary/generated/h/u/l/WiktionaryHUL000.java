package org.swtk.commons.dict.wiktionary.generated.h.u.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hula", "{\"term\":\"hula\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"hawaiian\"], \"text\":\"From Hawaiian \u0027hula\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of chant and dance, which was developed in the Hawaiian Islands by the Polynesians who originally settled there\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hulk", "{\"term\":\"hulk\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"The name of a character created by w:Stan Lee|Stan Lee and w:Jack Kirby|Jack Kirby for the w:Marvel Comics Universe|Marvel Comics Universe, it has since entered the everyday English lexicon. The name itself is most likely derived from the same word, hulk, which predates the existence of the character. See the Wikipedia link at the bottom.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fictional comic-book character who gains superhuman strength when he becomes angry\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027 November 27, Ken Keeler and David X. Cohen, “Bender’s Big Score”, \u0027Futurama\u0027, 20th Century Fox Home Entertainmen\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Fry:\u0027 How can you say Lars is more mature than me\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Leela:\u0027 Well, for one thing, his checkbook doesn\u0027t have the \u0027\u0027Hulk\u0027\u0027 on it\", \"priority\":4}]}, \"synonyms\":{}}");

	add("hulkamania", "{\"term\":\"hulkamania\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|Hulk|-a-|-mania|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Enthusiasm for the professional wrestler (Terry Gene Bollea\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hulkamaniac", "{\"term\":\"hulkamaniac\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|Hulk|-a-|-maniac|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fan of the professional wrestler (Terry Gene Bollea\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, R. D. Reynolds, Blade Braxton, \u0027The Wrestlecrap Book of Lists!\u0027 (page 322\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"This DVD also addresses the long-rumored belief that the defense\u0027s main argument was, “But only like twelve people even bought that show.” A must for every \u0027\u0027Hulkamaniac\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Nicholas Sammond, \u0027Steel chair to the head\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"I argued that the presentational skills he learned in wrestling — how to work a crowd, how to build a promo up to its crescendo, and how to connect with the \u0027\u0027Hulkamaniac\u0027\u0027 generation — made him the ideal third-party candidate\", \"priority\":5}]}, \"synonyms\":{}}");

	add("huller", "{\"term\":\"huller\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, hulls; especially, an agricultural machine for removing the hulls from grain; a hulling machine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hullock", "{\"term\":\"hullock\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small part of a sail lowered in a gale to keep the ship’s head to the sea\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hulsite", "{\"term\":\"hulsite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monoclinic-prismatic black mineral containing boron, iron, magnesium, oxygen, and tin\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }