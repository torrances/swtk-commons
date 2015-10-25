package org.swtk.commons.dict.wiktionary.generated.o.e.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOEN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oenologue", "{\"term\":\"oenologue\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|oeno|logue|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An enologist\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oenology", "{\"term\":\"oenology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|oeno|logy|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The scientific study of and winemaking\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Even though I can\u0027t drink wine, I can still study \u0027\u0027oenology\u0027\u0027 and enjoy knowing about the great wines of the world\", \"priority\":2}]}, \"synonyms\":{}}");

	add("oenomania", "{\"term\":\"oenomania\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"{{confix|oeno|mania|lang\u003den}}, from Ancient greek (to 1453) \u0027οἶνος\u0027 (wine) combined with \u0027μανία\u0027 (insanity)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Morbid desire for wine; dipsomania; alcoholism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oenomaniac", "{\"term\":\"oenomaniac\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|oeno|maniac|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who is affected by , a morbid desire for wine; an alcoholic\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1979\u0027\u0027, [title?], quoted in \u0027Best Sellers: From the U.S. Government Printing Office\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"It was Erskine Blight-Purley, war hero, Francophile, bibliophile, \u0027\u0027oenomaniac\u0027\u0027, and lecher of long standing and renown\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, William S. Haubrich, \u0027Medical Meanings: A Glossary of Word Origins\u0027 (ISBN 1930513496), page 162\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"An oenophile does not become of professional concern to physicians until he becomes an \u0027\u0027oenomaniac\u0027\u0027, that is, one who is overly wild about wine\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Stan Otremba, \u0027So, You Want to Be a Cop?: An Inside Look at Law Enforcement\u0027 (ISBN 0595530281\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"We stopped for a refreshing cup of milk, made our introductions, and moved on. The next stop was the Branquinho Ranch for lunch. There, we gave \u0027\u0027oenomaniac\u0027\u0027 John Branquino his gallon of wine\", \"priority\":7}]}, \"synonyms\":{}}");

	add("oenophilia", "{\"term\":\"oenophilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A love or great appreciation of wine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }