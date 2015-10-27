package org.swtk.commons.dict.wordnet.index.name.instance.v.i.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVITA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vitaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13165080\"]}");
	add("{\"term\":\"vitalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14073034\"]}");
	add("{\"term\":\"vitaliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10075911\"]}");
	add("{\"term\":\"vitalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05986844\"]}");
	add("{\"term\":\"vitalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10777485\"]}");
	add("{\"term\":\"vitality\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05012993\", \"11544272\", \"14073625\", \"04640810\"]}");
	add("{\"term\":\"vitalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14073034\"]}");
	add("{\"term\":\"vitalizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10075911\"]}");
	add("{\"term\":\"vitalness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05178879\", \"05179018\"]}");
	add("{\"term\":\"vitals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05305812\"]}");
	add("{\"term\":\"vitamin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15113825\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }