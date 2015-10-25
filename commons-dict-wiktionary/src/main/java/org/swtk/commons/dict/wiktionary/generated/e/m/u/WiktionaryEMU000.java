package org.swtk.commons.dict.wiktionary.generated.e.m.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEMU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("emulation", "{\"term\":\"emulation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027émulation\u0027 from Latin {{m|la|aemulātiōnem}}, accusative singular form of {{m|la|aemulātiō}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The endeavor or desire to equal or excel someone else in qualities or actions\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"is a great figure who is worthy of respect and \u0027\u0027emulation\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Jealous rivalry; envy; envious contention\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"New York Review Books 2001, p.263\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Scarce two gentlemen dwell together in the country\u0026amp;nbsp;[…], but there is \u0027\u0027emulation\u0027\u0027 betwixt them and their servants, some quarrel or some grudge betwixt their wives or children\u0026amp;nbsp;[…\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Running a program or other software designed for a different system\", \"priority\":6}]}, \"synonyms\":{}}");

	add("emulator", "{\"term\":\"emulator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person or thing that emulates\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"but I find in the life of this \u0027\u0027emulator\u0027\u0027 of Caesar actions which, if necessity warranted, the heart must still refuse to approve\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A piece of software or hardware that simulates another system\", \"priority\":3}]}, \"synonyms\":{}}");

	add("emulsifier", "{\"term\":\"emulsifier\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A substance that helps an emulsion form, or helps keep an emulsion from separating\", \"priority\":1}]}, \"synonyms\":{}}");

	add("emulsoid", "{\"term\":\"emulsoid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|emulsion|colloid|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A colloid solution consisting of a suspension of liquid particles in a liquid\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }