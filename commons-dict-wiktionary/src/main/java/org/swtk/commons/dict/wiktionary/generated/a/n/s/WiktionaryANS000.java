package org.swtk.commons.dict.wiktionary.generated.a.n.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryANS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ansi", "{\"term\":\"ansi\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lang\u003den\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ansatz", "{\"term\":\"ansatz\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German \u0027ansatz\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mathematical assumption used to describe a certain phenomenon, posited in order to help provisionally solve an equation or other problem\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, \u0026amp; Jeff Forshaw, \u0027The Quantum World\u0027, Allen Lane 2011, page 12\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In such cases, scientists often make an \u0027\u0027ansatz\u0027\u0027, an educated guess if you like, and then proceed to compute the consequences of the guess\", \"priority\":3}]}, \"synonyms\":{}}");

	add("anschluss", "{\"term\":\"anschluss\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German \u0027anschluss\u0027 (annexation) (formerly \u0027anschluß\u0027 , from \u0027anschließen\u0027 (to join, unite)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Political annexation, specifically that of Austria into Nazi Germany in 1938\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1941\u0027\u0027, \u0027Up at the Villa\u0027, Vintage 2004, page 44\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"‘Some of us students protested against the \u0027\u0027Anschluss\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, \u0027Even As We Speak\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Anton Kuh was one of the Viennese coffee-house wits whose mastery of the brief critical essay reached its apotheosis in the last nervous years before the \u0027\u0027\u0027Anschluss\", \"priority\":5}]}, \"synonyms\":{}}");

	add("anselm", "{\"term\":\"anselm\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\"], \"text\":\"Proto-germanic {{m|gem-pro|*ansuz||god}} + \u0027helm\u0027 (helmet) Name of an Archbishop of Canterbury, who was a Lombard by birth.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"quite rare in English\", \"priority\":1}]}, \"synonyms\":{}}");

	add("answerability", "{\"term\":\"answerability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|answerable|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being answerable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("answerphone", "{\"term\":\"answerphone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|answer|telephone|alt2\u003d(tele)phone|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A telephone containing a built-in device for recording incoming callers’ messages for later retrieval\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I keep trying to call her, but all I get is the \u0027\u0027answerphone\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }