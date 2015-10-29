package org.swtk.commons.dict.wordnet.indexbyname.instance.o.x.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOXI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oxidant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14804199\"]}");
	add("{\"term\":\"oxidase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995793\"]}");
	add("{\"term\":\"oxidation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13551611\"]}");
	add("{\"term\":\"oxidation number\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13612517\"]}");
	add("{\"term\":\"oxidation state\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13612517\"]}");
	add("{\"term\":\"oxidative phosphorylation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13552192\"]}");
	add("{\"term\":\"oxide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14996078\"]}");
	add("{\"term\":\"oxidisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13551611\"]}");
	add("{\"term\":\"oxidiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14804199\"]}");
	add("{\"term\":\"oxidization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13551611\"]}");
	add("{\"term\":\"oxidized ldl cholesterol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15083804\"]}");
	add("{\"term\":\"oxidizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14804199\"]}");
	add("{\"term\":\"oxidizing agent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14804199\"]}");
	add("{\"term\":\"oxidoreductase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14996528\"]}");
	add("{\"term\":\"oxidoreduction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13552002\"]}");
	add("{\"term\":\"oxime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14996651\"]}");
	add("{\"term\":\"oximeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03874321\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }