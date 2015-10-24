package org.swtk.commons.dict.wiktionary.generated.a.f.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAFR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("afrophobia", "{\"term\":\"afrophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Afro- + -phobia\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Fear, hate, or dislike of Black Africans and Black African descendant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1986\u0027\u0027, Carlton W. Molette, Barbara J. Molette, \u0027Black Theatre: premise and presentation\u0027, page 3\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Individuals who suffer from \u0027\u0027Afrophobia\u0027\u0027 often avoid facing this fear by ignoring Africa, its culture, and its people\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1998\u0027\u0027 (Mar 30), Christopher Ogden, \u0026quot;Good Will Bill\u0026quot;, \u0027Time\u0027 \u0027\u0027151\u0027\u0027 (13) [http://web.archive.org/web/20000816215306/http://www.time.com/time/magazine/1998/int/980330/africa.good_will_bill.at20.html\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The Somalia debacle prompted a fresh bout of \u0027\u0027Afrophobia\u0027\u0027 in Washington\", \"priority\":5}]}, \"synonyms\":{}}");

	add("afrormosia", "{\"term\":\"afrormosia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the African leguminous trees of the genus \u0027Pericopsis\u0027 (formerly ), especially ; the timber of these trees\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }