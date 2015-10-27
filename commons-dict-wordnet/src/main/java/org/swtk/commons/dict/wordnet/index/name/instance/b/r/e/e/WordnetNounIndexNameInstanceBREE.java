package org.swtk.commons.dict.wordnet.index.name.instance.b.r.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBREE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"breech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899143\"]}");
	add("{\"term\":\"breechblock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899336\"]}");
	add("{\"term\":\"breechcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899556\"]}");
	add("{\"term\":\"breechclout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899556\"]}");
	add("{\"term\":\"breeches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899704\"]}");
	add("{\"term\":\"breechloader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02900139\"]}");
	add("{\"term\":\"breed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05848056\", \"08118376\"]}");
	add("{\"term\":\"breeder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09893365\"]}");
	add("{\"term\":\"breeding\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00851153\", \"00916760\", \"01131853\", \"04929077\", \"04820771\"]}");
	add("{\"term\":\"breeze\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00576402\", \"11451868\"]}");
	add("{\"term\":\"breeziness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04641154\", \"14547389\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }