package org.swtk.commons.dict.wordnet.index.name.instance.l.i.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"livedo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14253270\"]}");
	add("{\"term\":\"livelihood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13386459\"]}");
	add("{\"term\":\"liveliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04639514\", \"00553473\"]}");
	add("{\"term\":\"livelong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807224\"]}");
	add("{\"term\":\"liveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05012631\"]}");
	add("{\"term\":\"liver\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10287877\", \"10287996\", \"07667661\", \"05392877\"]}");
	add("{\"term\":\"liverleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11755522\"]}");
	add("{\"term\":\"livermore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11155478\"]}");
	add("{\"term\":\"liverpool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08897609\"]}");
	add("{\"term\":\"liverpudlian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09723905\"]}");
	add("{\"term\":\"liverwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11563091\"]}");
	add("{\"term\":\"liverwurst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07693105\"]}");
	add("{\"term\":\"livery\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00660189\", \"01110658\", \"03684500\"]}");
	add("{\"term\":\"liveryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10288119\"]}");
	add("{\"term\":\"livestock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01890115\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }