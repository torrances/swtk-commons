package org.swtk.commons.dict.wiktionary.generated.g.a.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGAV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gavage", "{\"term\":\"gavage\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027lang\u003dfr\u0027 from \u0027lang\u003dfr|gaver\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A process of force-feeding a goose for foie gra\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A process of force-feeding cattle for vea\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Feeding by means of a tube passed into the stomach\", \"priority\":3}]}, \"synonyms\":{}}");

	add("gavelkind", "{\"term\":\"gavelkind\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a system of inheritance associated with the county of Kent in England whereby, at the death of a tenant, intestate estate is divided equally among all his sons; also, a similar system employed in Ireland\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }