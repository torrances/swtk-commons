package org.swtk.commons.dict.wiktionary.generated.u.r.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryURI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("uricemia", "{\"term\":\"uricemia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An elevated level of uric acid in the blood\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uricosuria", "{\"term\":\"uricosuria\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The presence of uric acid in the urine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uricotelism", "{\"term\":\"uricotelism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The excretion of uric acid or its salts as a result of deamination\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uridine", "{\"term\":\"uridine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nucleoside formed from uracil and ribose\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urine", "{\"term\":\"urine\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Middle english (1100-1500) from Old french (842-ca. 1400) from Latin \u0027lang\u003dla|ūrīna\u0027 () from Proto-indo-european {{m|ine-pro|*uh₁r-}}, zero grade of {{m|ine-pro|*weh₁r-||water, liquid, milk}}. Related to {{m|ine-pro|*h₁ewHdʰr̥-}} (see \u0027udder\u0027 .\u0026lt;ref\u0026gt;Watkins, Calvert (2000). \u0027The American Heritage Dictionary of Indo-European Roots\u0027. 2nd edition, page 100, s.v. \u0027wē-r-\u0027. ISBN 0-618-08250-6.\u0026lt;/ref\u0026gt; Displaced native English {{l|en|land||urine}}, (Middle english (1100-1500) \u0027land\u0027 from Old english (ca. 450-1100) \u0027hland\u0027 (urine) .\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Liquid excrement consisting of water, salts and urea, which is made in the kidneys, stored in the bladder, then released through the urethra\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dAn artificial kidney these days still means a refrigerator-sized dialysis machine. Such devices mimic the way real kidneys cleanse blood and eject impurities and surplus water as \u0027\u0027urine\", \"priority\":2}]}, \"synonyms\":{}}");

	add("urinomics", "{\"term\":\"urinomics\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|urine|omics|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The identification of the totality of the constituents of the urine of an organism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uritis", "{\"term\":\"uritis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"inflammation following a burn\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }