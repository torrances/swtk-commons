package org.swtk.commons.dict.wordnet.index.name.instance.t.a.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTART {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tart\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07639273\", \"07639542\", \"10505025\"]}");
	add("{\"term\":\"tartan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04402241\"]}");
	add("{\"term\":\"tartar\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09478055\", \"09664724\", \"10049454\", \"15037836\"]}");
	add("{\"term\":\"tartarus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05638060\"]}");
	add("{\"term\":\"tartary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08990741\"]}");
	add("{\"term\":\"tartlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07639948\"]}");
	add("{\"term\":\"tartness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04650754\", \"05001304\", \"05724691\"]}");
	add("{\"term\":\"tartrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14979698\"]}");
	add("{\"term\":\"tartu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09035105\"]}");
	add("{\"term\":\"tartufe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10711433\"]}");
	add("{\"term\":\"tartuffe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10711433\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }