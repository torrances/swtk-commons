package org.swtk.commons.dict.wordnet.index.name.instance.b.o.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBONE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bone\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04968508\", \"14782027\", \"05277400\"]}");
	add("{\"term\":\"bonefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02545063\"]}");
	add("{\"term\":\"bonehead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10059388\"]}");
	add("{\"term\":\"bonelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05285227\"]}");
	add("{\"term\":\"bonemeal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14806992\"]}");
	add("{\"term\":\"boner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00075610\"]}");
	add("{\"term\":\"bones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02872589\"]}");
	add("{\"term\":\"boneset\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11989400\", \"12843715\"]}");
	add("{\"term\":\"bonesetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09884953\"]}");
	add("{\"term\":\"boneshaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02872924\"]}");
	add("{\"term\":\"bonete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09249498\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }