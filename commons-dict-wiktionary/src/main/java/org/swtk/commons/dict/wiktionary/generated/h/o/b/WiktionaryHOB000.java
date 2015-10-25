package org.swtk.commons.dict.wiktionary.generated.h.o.b;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHOB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hobo", "{\"term\":\"hobo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{unk.|en}}. Possibly a contraction of \u0027\u0027 () or the dialectal English term \u0027hawbuck\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A homeless, usually penniless person, in some way associated with a life along the rails\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A migratory labore\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A tramp, vagabond; hence bum\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hobbesianism", "{\"term\":\"hobbesianism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Hobbesian|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Hobbesian philosophical system\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hobbism", "{\"term\":\"hobbism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Hobbes|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Hobbesian philosophical system\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hobble", "{\"term\":\"hobble\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"usually in plural\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Short straps tied between the legs of unfenced horses, allowing them to wander short distances but preventing them from running off\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An unsteady, off-balance step\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hobblebush", "{\"term\":\"hobblebush\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|hobble|bush|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A low bush, having long, straggling branches and pretty flowers, found in the Northern United States\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hobbyist", "{\"term\":\"hobbyist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hobby|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who is interested in a subject or an activity as a hobb\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"This computer magazine is targetted to both professionals and \u0027\u0027hobbyists\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hobnail", "{\"term\":\"hobnail\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|hob|nail|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A short nail with a thick head, typically used in boot soles\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A clownish person; a rustic\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hobohemia", "{\"term\":\"hobohemia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|hobo|bohemia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A community of hoboes\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }