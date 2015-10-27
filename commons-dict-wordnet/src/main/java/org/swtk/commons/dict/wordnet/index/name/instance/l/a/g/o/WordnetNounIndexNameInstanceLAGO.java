package org.swtk.commons.dict.wordnet.index.name.instance.l.a.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lagodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02594874\"]}");
	add("{\"term\":\"lagomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02326101\"]}");
	add("{\"term\":\"lagomorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02325838\"]}");
	add("{\"term\":\"lagoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09351652\"]}");
	add("{\"term\":\"lagophthalmos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14222628\"]}");
	add("{\"term\":\"lagopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01798863\"]}");
	add("{\"term\":\"lagorchestes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01880844\"]}");
	add("{\"term\":\"lagos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08996974\"]}");
	add("{\"term\":\"lagostomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02370645\"]}");
	add("{\"term\":\"lagothrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02496888\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }