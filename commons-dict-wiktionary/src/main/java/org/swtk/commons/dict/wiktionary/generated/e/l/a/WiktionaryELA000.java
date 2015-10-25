package org.swtk.commons.dict.wiktionary.generated.e.l.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryELA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("elamite", "{\"term\":\"elamite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Elam|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dweller in ancient Elam\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eland", "{\"term\":\"eland\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Dutch\"], \"text\":\"From Dutch \u0027eland\u0027 (elk)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A genus of large South African antelope (), valued both for its hide and flesh\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elassomatid", "{\"term\":\"elassomatid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any member of the\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elastane", "{\"term\":\"elastane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Spandex\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elasticin", "{\"term\":\"elasticin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Elastin\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elasticity", "{\"term\":\"elasticity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{affix|en|elastic|-ity}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property by virtue of which a material deformed under the load can regain its original dimensions when unloade\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The sensitivity of changes in a quantity with respect to changes in another quantity\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"If the sales of an item drop by 5 % when the price increases by 10 %, its price \u0027\u0027elasticity\u0027\u0027 is -0.5\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The quality of being elastic\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Adaptability\", \"priority\":5}]}, \"synonyms\":{}}");

	add("elasticness", "{\"term\":\"elasticness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|elastic|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being elastic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elastography", "{\"term\":\"elastography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A method of detection or classification of tumors based on stiffness or elasticity of tissue\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elastometry", "{\"term\":\"elastometry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The measurement of elasticity\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elastoplasticity", "{\"term\":\"elastoplasticity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of showing both elastic and plastic properties, typically as a result of being stretched beyond an elastic limit\", \"priority\":1}]}, \"synonyms\":{}}");

	add("elation", "{\"term\":\"elation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Middle english (1100-1500) \u0027elacioun\u0027 from Old french (842-ca. 1400) \u0027elacion\u0027 from Latin {{m|la|ēlātiōnem}}, accusative singular of {{m|la|ēlātiō||exaltation, elevation; pride, elation}}, from {{m|la|ēlātus}}, perfect passive participle of {{m|la|efferō||bring forth or out; raise; exalt}}, from {{m|la|ē||out of}}, short form of \u0027ex\u0027 + {{m|la|ferō||carry, bear}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An exhilarating psychological state of pride and optimism\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A feeling of joy and pride\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A collineation that fixes all points on a line (called its axis) and all lines though a point on the axis (called its center\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }