package org.swtk.commons.dict.wiktionary.generated.i.d.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryIDO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("idolater", "{\"term\":\"idolater\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027idolatre\u0027 from Latin \u0027idololatra\u0027 \u0026lt;sup\u0026gt;\u0026lt;span class\u003d\u0026quot;plainlinks\u0026quot;\u0026gt;[http://books.google.co.uk/books?id\u003d6aARAAAAIAAJ\u0026amp;pg\u003dPT687\u0026amp;dq\u003d%22*+-later%22+latry\u0026amp;ei\u003d5QahSqmqF4XUM7as1ZE. v\u003donepage\u0026amp;q\u003d%22ido%27later%22\u0026amp;f\u003dfalse]\u0026lt;/span\u0026gt;\u0026lt;/sup\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"female\u0027 \u0027\u0027idolatress\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who worships idols; a pagan\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I wrote unto you in an epistle not to company with fornicators: Yet not altogether with the fornicators of this world, or with the covetous, or extortioners, or with \u0027\u0027idolaters\u0027\u0027; for then must ye needs go out of the world. But now I have written unto you not to keep company, if any man that is called a brother be a fornicator, or covetous, or an \u0027\u0027idolater\u0027\u0027, or a railer, or a drunkard, or an extortioner; with such an one no not to eat. For what have I to do to judge them also that are without? do not ye judge them that are within?\u0027 — 1 Corinthians 5:9-12 KJV\", \"priority\":3}]}, \"synonyms\":{}}");

	add("idolatress", "{\"term\":\"idolatress\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|idolater|ess|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a female idolater\", \"priority\":1}]}, \"synonyms\":{}}");

	add("idolatry", "{\"term\":\"idolatry\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"French\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Italian\", \"Occitan\"], \"text\":\"From Old french (842-ca. 1400) \u0027idolatrie\u0027 \u0027ydolatrie\u0027 from {{m|la|īdōlatrīa}}, from {{m|la|īdōlolatrīa}}, from Ancient greek (to 1453) \u0027εἰδωλολατρία\u0027 (worship of idols) back-formation from \u0027εἰδωλολάτρης\u0027 () ({{m|la|īdōlatra}} in Latin), from \u0027εἴδωλον\u0027 (idol) + \u0027λάτρις\u0027 (worshipper) or \u0027λατρεύω\u0027 (i worship) from \u0027λάτρον\u0027 (payment) cognate with modern French \u0027idolâtrie\u0027 Italian \u0027idolatria\u0027 Occitan \u0027ydolatria\u0027 and Spanish \u0027idolatria\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The worship of idols\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The admiration of somebody or something\", \"priority\":2}]}, \"synonyms\":{}}");

	add("idolism", "{\"term\":\"idolism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|idol|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The worship of idols\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }