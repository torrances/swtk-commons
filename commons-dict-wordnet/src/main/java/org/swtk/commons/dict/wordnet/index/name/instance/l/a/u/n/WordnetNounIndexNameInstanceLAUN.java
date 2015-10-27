package org.swtk.commons.dict.wordnet.index.name.instance.l.a.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"launce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02621143\"]}");
	add("{\"term\":\"launch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00103960\", \"03652737\"]}");
	add("{\"term\":\"launcher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02985687\", \"03652834\"]}");
	add("{\"term\":\"launching\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00103960\", \"00238889\", \"00104111\"]}");
	add("{\"term\":\"launchpad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03653005\"]}");
	add("{\"term\":\"launderette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03653186\"]}");
	add("{\"term\":\"laundering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00579745\"]}");
	add("{\"term\":\"laundress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788856\"]}");
	add("{\"term\":\"laundromat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03653186\"]}");
	add("{\"term\":\"laundry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03653380\", \"03653533\"]}");
	add("{\"term\":\"laundryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788752\"]}");
	add("{\"term\":\"laundrywoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788856\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }