package org.swtk.commons.dict.wordnet.index.name.instance.a.r.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"argo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09228495\"]}");
	add("{\"term\":\"argon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14653098\"]}");
	add("{\"term\":\"argonaut\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01973308\", \"09612759\", \"09630812\"]}");
	add("{\"term\":\"argonauta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01973143\"]}");
	add("{\"term\":\"argonautidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01972983\"]}");
	add("{\"term\":\"argonne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01289924\"]}");
	add("{\"term\":\"argonon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14648547\"]}");
	add("{\"term\":\"argos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08804512\"]}");
	add("{\"term\":\"argosy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08403011\"]}");
	add("{\"term\":\"argot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07171981\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }