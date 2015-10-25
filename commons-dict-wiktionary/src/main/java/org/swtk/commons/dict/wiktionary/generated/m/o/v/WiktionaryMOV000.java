package org.swtk.commons.dict.wiktionary.generated.m.o.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMOV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mover", "{\"term\":\"mover\", \"etymology\":{\"influencers\":[], \"languages\":[\"asturian\", \"Latin\"], \"text\":\"From Latin {{m|la|movēre}}, present active infinitive of {{m|la|moveō}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who or something which moves\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A dancer\", \"priority\":2}]}, \"synonyms\":{}}");

	add("movement", "{\"term\":\"movement\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027movement\u0027 (modern French \u0027mouvement\u0027 , from \u0027movimentum\u0027 from Latin \u0027movere\u0027 (move)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Physical motion between points in space\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I saw a \u0027\u0027movement\u0027\u0027 in that grass on the hill\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A system or mechanism for transmitting motion of a definite character, or for transforming motion, such as the wheelwork of a watch\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The impression of motion in an artwork, painting, novel etc\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A trend in various fields or social categories, a group of people with a common ideology who try together to achieve certain general goal\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The labor \u0027\u0027movement\u0027\u0027 has been struggling in America since the passage of the Taft-Hartley act in 1947\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A large division of a larger composition\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"An instance of an aircraft taking off or landing\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Albuquerque International Sunport serviced over 200,000 \u0027\u0027movements\u0027\u0027 last year\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"The deviation of a pitch from ballistic flight\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027movement\u0027\u0027 on his cutter was devastating\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"An act of emptying the bowels\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"Motion of the mind or feelings; emotion\", \"priority\":13}]}, \"synonyms\":{}}");

	add("moviedom", "{\"term\":\"moviedom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|movie|dom|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The world of movies and movie productio\", \"priority\":1}]}, \"synonyms\":{}}");

	add("moviegoer", "{\"term\":\"moviegoer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|movie|goer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Person who regularly frequen\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"frequents movie theaters\", \"priority\":2}]}, \"synonyms\":{}}");

	add("movieholic", "{\"term\":\"movieholic\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|movie|holic|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A movie enthusiast\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Christine Vachon, \u0027A Killer Life: How an Independent Film Producer Survives Deals and Disasters in Hollywood and Beyond\u0027, Simon \u0026amp; Schuster, ISBN 0743256301, chapter 3\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Kim really was a \u0027\u0027movieholic\u0027\u0027. She had seen everything. To me, that is usually a sign of someone who\u0027s for real. It made her very attuned to classical story references and structure\", \"priority\":3}]}, \"synonyms\":{}}");

	add("movieland", "{\"term\":\"movieland\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The industry of films and filmmaking\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The fictitious world where films are set\", \"priority\":2}]}, \"synonyms\":{}}");

	add("moviemaking", "{\"term\":\"moviemaking\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|movie|making|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The production of movie\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Moviemaking\u0027\u0027 is a very different art from stage production\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }