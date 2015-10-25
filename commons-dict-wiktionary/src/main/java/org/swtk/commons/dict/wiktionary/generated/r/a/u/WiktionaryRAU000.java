package org.swtk.commons.dict.wiktionary.generated.r.a.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRAU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("raubasine", "{\"term\":\"raubasine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"ajmalicine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("raunch", "{\"term\":\"raunch\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Backformation of \u0027lang\u003den\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Low class condition or content; inferiority; inadequacy\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Dishonorable, base, and vulgar expression\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.economist.com/news/leaders/http://www.economist.com/news/britain/21583661-what-row-about-tabloid-nudity-says-about-sex-and-society-tits-out Tits, passage\u003dThese days, \u0027\u0027raunch\u0027\u0027 is everywhere—not only on the internet and television, but on advertising hoardings and the sides of buses. Another online campaign is aimed at sanitising the covers of sub-pornographic “lads’ mags”\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Socially unacceptable sexual behavior\", \"priority\":4}]}, \"synonyms\":{}}");

	add("rauwolscine", "{\"term\":\"rauwolscine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A stereoisomer of yohimbine with stimulant and aphrodisiac properties\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }