package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dissatisfaction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07554899\"]}");
	add("{\"term\":\"dissection\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00650174\", \"05790137\", \"00388022\"]}");
	add("{\"term\":\"dissembler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10215212\"]}");
	add("{\"term\":\"dissembling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00753774\", \"06772060\"]}");
	add("{\"term\":\"dissemination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00369400\", \"05095263\", \"06263270\"]}");
	add("{\"term\":\"disseminator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10502723\"]}");
	add("{\"term\":\"dissension\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14005842\", \"07196206\"]}");
	add("{\"term\":\"dissent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01179523\", \"07196018\", \"07223965\"]}");
	add("{\"term\":\"dissenter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10037746\"]}");
	add("{\"term\":\"dissertation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06420728\"]}");
	add("{\"term\":\"disservice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01212281\"]}");
	add("{\"term\":\"dissidence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07195868\"]}");
	add("{\"term\":\"dissident\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10037746\"]}");
	add("{\"term\":\"dissilience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07449382\"]}");
	add("{\"term\":\"dissimilarity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04757437\"]}");
	add("{\"term\":\"dissimilation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13464960\", \"13488646\"]}");
	add("{\"term\":\"dissimilitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04758019\"]}");
	add("{\"term\":\"dissimulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00753774\"]}");
	add("{\"term\":\"dissimulator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10215212\"]}");
	add("{\"term\":\"dissipation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00743943\", \"00749605\", \"07346748\"]}");
	add("{\"term\":\"dissociation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13488903\", \"14440249\", \"00385610\"]}");
	add("{\"term\":\"dissolubility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05017498\"]}");
	add("{\"term\":\"dissoluteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04892012\"]}");
	add("{\"term\":\"dissolution\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00216181\", \"00216905\", \"00749605\", \"13489297\", \"13489119\"]}");
	add("{\"term\":\"dissolve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06630542\"]}");
	add("{\"term\":\"dissolvent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15071880\"]}");
	add("{\"term\":\"dissolver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15071880\"]}");
	add("{\"term\":\"dissolving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13489297\"]}");
	add("{\"term\":\"dissonance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04991763\", \"05728195\", \"14005842\"]}");
	add("{\"term\":\"dissuasion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07260346\", \"07268616\"]}");
	add("{\"term\":\"dissyllable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06301319\"]}");
	add("{\"term\":\"dissymmetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05072886\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }