package org.swtk.commons.dict.wiktionary.generated.h.a.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHAG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hagberry", "{\"term\":\"hagberry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|hag|berry|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Prunus padus\u0027, a species of cherry native to northern Europe and northern Asia, the bird cherry\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Its bittersweet astringent fruit, readily eaten by birds and Russians\", \"priority\":2}]}, \"synonyms\":{}}");

	add("haggis", "{\"term\":\"haggis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a traditional Scottish dish made from minced offal and oatmeal etc, boiled in the stomach of a sheep etc; traditionally served with neeps and tatties and accompanied with whisky\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hagiographer", "{\"term\":\"hagiographer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hagiography|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who writes the biography of a saint\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Someone who writes praising and flattering things about a person (as if that person \u0027were\u0027 a saint\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hagiography", "{\"term\":\"hagiography\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ἅγιος\u0027 (holy) + \u0027-γραφία\u0027 (writing)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of saints\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A biography of a saint\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A biography which expresses reverence and respect for its subject\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A biography which is uncritically supportive of its subject, often including embellishments or propaganda\", \"priority\":4}]}, \"synonyms\":{}}");

	add("hagiolatry", "{\"term\":\"hagiolatry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|hagio|latry|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The worship of saints\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1971\u0027\u0027, \u0027Religion and the Decline of Magic\u0027, Folio Society 2012, p. 25\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Individual churches had their own patron saints, and strong territorial associations could give \u0027\u0027hagiolatry\u0027\u0027 an almost totemic character […\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }