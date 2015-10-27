package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trail\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05835238\", \"04473848\", \"09483442\"]}");
	add("{\"term\":\"trailblazer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10454492\", \"10741568\"]}");
	add("{\"term\":\"trailer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04474334\", \"04474542\", \"06901724\", \"10012790\"]}");
	add("{\"term\":\"trailhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08602974\"]}");
	add("{\"term\":\"trailing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00321110\"]}");
	add("{\"term\":\"train\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03436655\", \"04475711\", \"07309535\", \"08444586\", \"08476659\", \"04475240\"]}");
	add("{\"term\":\"trainband\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08302640\"]}");
	add("{\"term\":\"trainbandsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10741786\"]}");
	add("{\"term\":\"trainbearer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10741888\"]}");
	add("{\"term\":\"trainee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10742034\"]}");
	add("{\"term\":\"traineeship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13288839\"]}");
	add("{\"term\":\"trainer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03368209\", \"10742224\"]}");
	add("{\"term\":\"training\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04929077\", \"00895653\"]}");
	add("{\"term\":\"trainload\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13795016\"]}");
	add("{\"term\":\"trainman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10742407\"]}");
	add("{\"term\":\"trainmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10822635\"]}");
	add("{\"term\":\"trait\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04623416\"]}");
	add("{\"term\":\"traitor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10047315\", \"10742614\"]}");
	add("{\"term\":\"traitorousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04886853\"]}");
	add("{\"term\":\"traitress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10742879\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }