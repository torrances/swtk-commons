package org.swtk.commons.dict.wiktionary.generated.t.m.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTME000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tmesis", "{\"term\":\"tmesis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Coined 1586, from \u0027tmēsis\u0027 from Ancient greek (to 1453) \u0027lang\u003dgrc|τμῆσις\u0027 () from \u0027τέμνω\u0027 (i cut) Cognates include Bulgarian \u0027lang\u003dbg\u0027 Dutch \u0027lang\u003dnl\u0027 Finnish \u0027lang\u003dfi\u0027 French \u0027lang\u003dfr\u0027 German \u0027lang\u003dde\u0027 Greek \u0027lang\u003del\u0027 Italian \u0027lang\u003dit\u0027 Polish \u0027lang\u003dpl\u0027 Portuguese \u0027lang\u003dpt\u0027 Russian \u0027lang\u003dru\u0027 Serbo-Croatian \u0027lang\u003dsh\u0027 and \u0027lang\u003dsh\u0027 Spanish \u0027lang\u003des\u0027 and many more others.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The insertion of one or more words between the components of a compound word. into \u0026lt;br\u0026gt;\u0027Abso-fucking-lutely\u0027, insertion of swear word into \u0026lt;br\u0026gt;\u0027a whole A whole nother\u0027, a technically erroneous, but common insertion\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }