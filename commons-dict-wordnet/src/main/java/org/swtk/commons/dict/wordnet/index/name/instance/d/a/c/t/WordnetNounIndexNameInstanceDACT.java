package org.swtk.commons.dict.wordnet.index.name.instance.d.a.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDACT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dactyl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05573730\", \"07109814\"]}");
	add("{\"term\":\"dactylis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12136784\"]}");
	add("{\"term\":\"dactyloctenium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12137100\"]}");
	add("{\"term\":\"dactylomegaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14390654\"]}");
	add("{\"term\":\"dactylopiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02252647\"]}");
	add("{\"term\":\"dactylopius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02252785\"]}");
	add("{\"term\":\"dactylopteridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02654476\"]}");
	add("{\"term\":\"dactylopterus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02654635\"]}");
	add("{\"term\":\"dactylorhiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12078930\"]}");
	add("{\"term\":\"dactyloscopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02614676\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }