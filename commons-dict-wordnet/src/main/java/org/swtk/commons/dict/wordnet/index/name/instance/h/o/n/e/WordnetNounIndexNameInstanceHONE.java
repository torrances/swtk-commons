package org.swtk.commons.dict.wordnet.index.name.instance.h.o.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHONE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03535691\"]}");
	add("{\"term\":\"honegger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11077674\"]}");
	add("{\"term\":\"honestness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04878569\"]}");
	add("{\"term\":\"honesty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11912010\", \"04878569\"]}");
	add("{\"term\":\"honey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09869006\", \"07874954\"]}");
	add("{\"term\":\"honeybee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02210932\"]}");
	add("{\"term\":\"honeybells\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12221021\"]}");
	add("{\"term\":\"honeycomb\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03535822\", \"09241222\"]}");
	add("{\"term\":\"honeycreeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01541596\", \"01547345\"]}");
	add("{\"term\":\"honeydew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07772301\"]}");
	add("{\"term\":\"honeyflower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12235727\", \"12240536\"]}");
	add("{\"term\":\"honeymoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15319031\", \"15163863\"]}");
	add("{\"term\":\"honeymooner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10375765\"]}");
	add("{\"term\":\"honeypot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12235539\"]}");
	add("{\"term\":\"honeysucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01529407\"]}");
	add("{\"term\":\"honeysuckle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11747827\", \"12236341\", \"12694881\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }