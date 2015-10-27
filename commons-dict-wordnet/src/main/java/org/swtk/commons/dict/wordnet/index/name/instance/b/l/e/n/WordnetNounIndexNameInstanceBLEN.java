package org.swtk.commons.dict.wordnet.index.name.instance.b.l.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBLEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"blend\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00381504\", \"06299307\", \"07390005\"]}");
	add("{\"term\":\"blende\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15132443\"]}");
	add("{\"term\":\"blender\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02853991\"]}");
	add("{\"term\":\"blending\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01005878\", \"00381504\"]}");
	add("{\"term\":\"blenheim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01274408\"]}");
	add("{\"term\":\"blenniidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02615612\"]}");
	add("{\"term\":\"blennioid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02615287\"]}");
	add("{\"term\":\"blennioidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02615023\"]}");
	add("{\"term\":\"blennius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02616064\"]}");
	add("{\"term\":\"blenny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02615811\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }