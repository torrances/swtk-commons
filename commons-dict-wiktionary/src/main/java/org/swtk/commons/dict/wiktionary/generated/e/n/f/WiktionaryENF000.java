package org.swtk.commons.dict.wiktionary.generated.e.n.f;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryENF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("enfeoffment", "{\"term\":\"enfeoffment\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|enfeoff|ment|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or process of transferring possession and ownership of an estate in land\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The property or estate so transferred\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The instrument or deed by which one obtains such property or estate\", \"priority\":3}]}, \"synonyms\":{}}");

	add("enfilade", "{\"term\":\"enfilade\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|enfilade|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A line or straight passage, or the position of that which lies in a straight line\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"date\u003d4 January passage\u003dIn his -winning novel \u0027\u0027, wrote about people who know their world history as being able to look back through the millennia as an \u0027\u0027enfilade\u0027\u0027 of rooms: Greece yields to Rome; Rome to the Byzantine Empire\u0026amp;nbsp;... the Renaissance\u0026amp;nbsp;... the British Empire\u0026amp;nbsp;... America\u0026amp;nbsp;... China. The same goes for people who can recite their kings and queens. British history clicks into a long \u0027\u0027enfilade\u0027\u0027 of discrete, identifiable periods\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Gunfire directed along the length of a target\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A series of doors that provide a vista when open\", \"priority\":4}]}, \"synonyms\":{}}");

	add("enfleurage", "{\"term\":\"enfleurage\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027enfleurage\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The process of extracting fragrance (essential oils) from flowers by using unscented wax or fat, then extracted with alcohol\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The perfumes of plants like jasmine could only be extracted by \u0027\u0027enfleurage\u0027\u0027, as other methods of the time would denature the scents\", \"priority\":2}]}, \"synonyms\":{}}");

	add("enforcer", "{\"term\":\"enforcer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who enforces\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The member of a group, especially of a gang, charged with keeping dissident members obedient\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A player tasked with physically intimidating or confronting the opposition\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }