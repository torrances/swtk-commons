package org.swtk.commons.dict.wiktionary.generated.l.e.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLEE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("leecher", "{\"term\":\"leecher\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|leech|er|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who leeches; a physician\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who downloads a torrent\", \"priority\":2}]}, \"synonyms\":{}}");

	add("leechline", "{\"term\":\"leechline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|leech|line|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A line attached to the leech ropes of sails, passing up through blocks on the yards, to haul the leeches by\", \"priority\":1}]}, \"synonyms\":{}}");

	add("leerer", "{\"term\":\"leerer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|leer|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who leers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"P. G. Wodehous\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He paws! He\u0027s a slinker and a prowler and a \u0027\u0027leerer\u0027\u0027. He\u0027s a pest and a worm\", \"priority\":3}]}, \"synonyms\":{}}");

	add("leetspeak", "{\"term\":\"leetspeak\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|leet|speak|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"m n00bz\u0026quot;* \u0027Transliteration:\u0027 \u0026quot;I owned some newbies.\u0026quot;* \u0027Formal English:\u0027 \u0026quot;I soundly defeated some newcomers.\u0026quot\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A form of chatspeak characterized most strongly by its alphanumeric substitutions\", \"priority\":2}]}, \"synonyms\":{}}");

	add("leeway", "{\"term\":\"leeway\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lee|t1\u003dside away from the wind|way|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The drift of a ship or airplane in a leeward direction\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A varying degree or amount of freedom or flexibility; margin, latitude, elbowroom\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I don\u0027t think we have a lot of \u0027\u0027leeway\u0027\u0027 when it comes to proper formatting\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, James Gosling et al., \u0027The Java Language Specification, Third Edition\u0027, Prentice Hall PTR, ISBN 0321246780, section 15.4 “FP-strict Expressions”,\u0026lt;sup \u0026gt;[http://java.sun.com/docs/books/jls/third_edition/html/expressions.htm\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"249198 ]\u0026lt;/sup\u0026gt\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Within an expression that is not -strict, some \u0027\u0027leeway\u0027\u0027 is granted for an implementation to use an extended exponent range to represent intermediate results\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"An adverse discrepancy or variation in a cumulative process, usually in make up leeway\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }