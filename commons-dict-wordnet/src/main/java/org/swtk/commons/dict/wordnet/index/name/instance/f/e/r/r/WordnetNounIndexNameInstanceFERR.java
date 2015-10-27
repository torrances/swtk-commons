package org.swtk.commons.dict.wordnet.index.name.instance.f.e.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFERR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ferrara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08823238\"]}");
	add("{\"term\":\"ferret\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02445977\", \"02446115\"]}");
	add("{\"term\":\"ferricyanide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14890194\"]}");
	add("{\"term\":\"ferrimagnetism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11500491\"]}");
	add("{\"term\":\"ferrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14883352\"]}");
	add("{\"term\":\"ferritin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14890317\"]}");
	add("{\"term\":\"ferrocerium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14890520\"]}");
	add("{\"term\":\"ferroconcrete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14828967\"]}");
	add("{\"term\":\"ferrocyanide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14890756\"]}");
	add("{\"term\":\"ferromagnetism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11500684\"]}");
	add("{\"term\":\"ferrule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03334481\"]}");
	add("{\"term\":\"ferry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01108492\", \"03334608\"]}");
	add("{\"term\":\"ferryboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03334608\"]}");
	add("{\"term\":\"ferrying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01108492\"]}");
	add("{\"term\":\"ferryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105218\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }