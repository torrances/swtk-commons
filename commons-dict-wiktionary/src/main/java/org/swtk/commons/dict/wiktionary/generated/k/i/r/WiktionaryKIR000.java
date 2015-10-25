package org.swtk.commons.dict.wiktionary.generated.k.i.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKIR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kirk", "{\"term\":\"kirk\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From kirk.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Presbyterian Church of Scotland\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kirby", "{\"term\":\"kirby\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Originally \u0027kirkby\u0027 from {{suffix|kirk|by|gloss1\u003dchurch|gloss2\u003dhabitation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An English placename\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A CDP in Arkansa\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A village in Ohi\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A hamlet in Ontario, Canad\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A city in Texa\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A town in Vermon\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A town in Wyomin\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"originally for a person from Kirby\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname\", \"priority\":10}]}, \"synonyms\":{}}");

	add("kirigami", "{\"term\":\"kirigami\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027切り紙\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Origami, with cutting permitted\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kiritimati", "{\"term\":\"kiritimati\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"gilbertese\"], \"text\":\"From the Gilbertese word \u0027kiritimati\u0027 (christmas) from English \u0027christmas\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An island of Kiribati, also called Christmas Island.Category:en:Islands\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kirkyard", "{\"term\":\"kirkyard\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|kirk|yard|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A churchyard, especially one in Scotland\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, \u0027Vanished Kingdoms\u0027, Penguin 2012, p. 60\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"It stands in the \u0027\u0027kirkyard\u0027\u0027 only six miles from the battle site […\", \"priority\":3}]}, \"synonyms\":{}}");

	add("kirovohrad", "{\"term\":\"kirovohrad\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\", \"Ukrainian\"], \"text\":\"From Ukrainian \u0027кіровоград\u0027 (tr\u003dkirovohrád) after Bolshevik leader w:Sergey Kirov|Sergey Kirov + \u0027град\u0027 (walled city) Compare Russian \u0027кировогра́д\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city on the Inhul river in Ukraine, administrative centre of Kirovohrad province\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Kirovohrad province (\u0027oblast\u0027), in central Ukraine\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kirsty", "{\"term\":\"kirsty\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Scottish diminutive of Christine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }