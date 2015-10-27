package org.swtk.commons.dict.wordnet.index.name.instance.p.a.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePATE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05547228\", \"07873935\"]}");
	add("{\"term\":\"patella\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01951558\", \"05285894\"]}");
	add("{\"term\":\"patellidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01951429\"]}");
	add("{\"term\":\"patency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04713638\", \"05091274\"]}");
	add("{\"term\":\"patent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06563618\", \"06513132\"]}");
	add("{\"term\":\"patentee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10425155\"]}");
	add("{\"term\":\"pater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10425285\"]}");
	add("{\"term\":\"paterfamilias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10426510\"]}");
	add("{\"term\":\"paternalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06205806\"]}");
	add("{\"term\":\"paternity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00241621\", \"13836110\", \"14602337\"]}");
	add("{\"term\":\"paternoster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03904797\", \"06469466\"]}");
	add("{\"term\":\"paterson\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09136673\", \"11245155\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }