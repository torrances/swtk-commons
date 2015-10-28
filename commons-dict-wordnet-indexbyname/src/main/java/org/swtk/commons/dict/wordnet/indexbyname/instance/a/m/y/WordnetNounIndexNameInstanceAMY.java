package org.swtk.commons.dict.wordnet.indexbyname.instance.a.m.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amygdala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05503222\"]}");
	add("{\"term\":\"amygdalaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12665225\"]}");
	add("{\"term\":\"amygdalin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14911615\"]}");
	add("{\"term\":\"amygdaloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14746899\"]}");
	add("{\"term\":\"amygdalotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00684975\"]}");
	add("{\"term\":\"amygdalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12665474\"]}");
	add("{\"term\":\"amyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14642012\"]}");
	add("{\"term\":\"amylase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14759636\"]}");
	add("{\"term\":\"amyloid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14754284\", \"15079429\"]}");
	add("{\"term\":\"amyloidosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14089175\"]}");
	add("{\"term\":\"amylolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13451564\"]}");
	add("{\"term\":\"amylum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15078434\"]}");
	add("{\"term\":\"amyotonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14569447\"]}");
	add("{\"term\":\"amyotrophia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14129111\"]}");
	add("{\"term\":\"amyotrophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14129111\"]}");
	add("{\"term\":\"amytal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706551\"]}");
	add("{\"term\":\"amyxia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14362253\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }