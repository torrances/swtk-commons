package org.swtk.commons.dict.wiktionary.generated.s.o.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySOD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sodaholic", "{\"term\":\"sodaholic\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|soda|holic|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a person who is addicted to soda or drinks it a lo\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sodality", "{\"term\":\"sodality\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From the French \u0027sodalité\u0027 or its etymon, the Latin \u0027sodālitās\u0027 from \u0027sodālis\u0027 (companion)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fraternity, a society or association\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1916\u0027\u0027, w:James James Joyce, \u0027w:Portrait of the Artist as a Young Portrait of the Artist as a Young Man\u0027, Macmillan Press Ltd, p. 98\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"On the wall of his bedroom hung an illuminated scroll, the certificate of his prefecture in the college of the \u0027\u0027sodality\u0027\u0027 of the Blessed Virgin Mary\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1963\u0027\u0027, Thomas Pynchon, \u0027V\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"There’d even evolved somehow a kind of \u0027\u0027sodality\u0027\u0027 or fan club that sat around, read from her books and discussed her Theory\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Companionship\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1968\u0027\u0027, Anthony Burgess, \u0027Enderby Outside\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Those would, he thought, be expatriate writers. He was, of course, one of those himself now, but he was indifferent to the duties and pleasures of \u0027\u0027sodality\", \"priority\":8}]}, \"synonyms\":{}}");

	add("sodium", "{\"term\":\"sodium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Coined by {{w|Humphry Davy}} in 1807, from \u0027soda\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A soft, waxy, silvery reactive metal that is never found unbound in nature, and a chemical element (\u0027symbol\u0027 Na) with an atomic number of 11 and atomic weight of 22.98977\", \"priority\":1}]}, \"synonyms\":{\"list\":[{\"text\":\"natrium\", \"synonymQualifier\":\"RARE\"}]}}");

	add("sodomist", "{\"term\":\"sodomist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|sodomy|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who practices sodomy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sodomy", "{\"term\":\"sodomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027sodom\u0027 where the Bible, in Genesis chapters 18 and 19 and elsewhere, suggests sexual depravity.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several forms of sexual intercourse held to be unnatural, particularly bestiality or homosexuality, but also (sometimes) anal anal or oral sex\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Christopher Berry-Dee, \u0027Serial Killers Up Close and Personal\u0027, page 12\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"engaged her in conversation as to where she was going, stated that he would take her to her destination directly, forced her to commit oral \u0027\u0027sodomy\u0027\u0027 upon him\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"They jailed her immediately after she was convicted of \u0027\u0027sodomy\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"anal sex\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }