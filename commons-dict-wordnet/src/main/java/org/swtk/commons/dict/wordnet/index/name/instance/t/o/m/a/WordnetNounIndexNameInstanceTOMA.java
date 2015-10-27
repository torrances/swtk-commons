package org.swtk.commons.dict.wordnet.index.name.instance.t.o.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tomahawk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04457237\"]}");
	add("{\"term\":\"tomalley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07809922\"]}");
	add("{\"term\":\"tomatillo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07750531\", \"12932200\", \"12932433\"]}");
	add("{\"term\":\"tomato\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12926577\", \"07749993\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }