package org.swtk.commons.dict.wiktionary.generated.c.c.c;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCCC000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("cccp",
				"{\"term\":\"cccp\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Russian {{m|ru|СССР}}, abbreviation of {{m|ru|Сою́з Сове́тских Социалисти́ческих Респу́блик|gloss\u003dThe Union of Soviet Socialist Republics}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"USSR (Union of Soviet Socialist Republics\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1992\u0027\u0027 July 27, Keith Morgan, \u0027NATO/Warsaw Pact forces (was Re: Greatest Prez...)\u0027, in \u0026lt;tt\u0026gt;soc.history\u0026lt;/tt\u0026gt;, \u0027Usenet\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Now that the \u0027\u0027CCCP\u0027\u0027 is history. I wonder if we\u0027ll find out who Suvorov really was\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, Martin Avery, \u0027Bobby Orr and Me\u0027, Lulu.com (ISBN 9780557036929), page 35\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Canada won the 1972 Summit Series against the \u0027\u0027CCCP\u0027\u0027, just barely, but lost a lot of face, bragging rights, prestige, sense of self, identity, and propaganda points, even though life in the Soviet Union, judging by the big hockey rink in Moscow, was dismal, at best, and a totalitarian police state nightmare, at worst\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027 September 21, \u0026quot;A Moose in Love\u0026quot; (username), \u0027Re: The Soviet invasion of Poland\u0027, in \u0026lt;tt\u0026gt;alt.revisionism\u0026lt;/tt\u0026gt;, \u0027Usenet\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027CCCP\u0027\u0027 had evil intentions as well[,] no\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, w:Tom Tom Hanks, introduction to \u0027Two Sides of the Moon: Our Story of the Cold War Space Race\u0027 by Alexei Leonov and David Scott, Open Road Media (ISBN 9781480448742\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A common generalisation about people who go into space, particularly those men who were the participants in the great space race between the USA and the \u0027\u0027CCCP\u0027\u0027, is that each is an automaton — a throttle jockey with a crew cut, a mind like a slide rule and a vocabulary of \u0027gee whiz\u0027 superlatives and \u0027A-OK\u0027 affirmatives\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"2014\u0027\u0027, Larisa Kharakhinova, \u0027Heart-to-heart letters: to MrRight from \u0027\u0027CCCP\u0027\u0027\u0027, Litres (ISBN 9785457226449), page 2\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"One question from Japanese side was: \u0027What about sex in \u0027\u0027CCCP\u0027\u0027?\u0027 and \u0027the illustrious reply\u0027 — one soviet woman, very venerable and respectable, deputy and laureate of something, — she answered with dignity: \u0027There is no sex in \u0027\u0027CCCP\u0027\u0027 at all!\u0027 — it was said with such a great pride, in such a peremptory tone, as if she was insulted in her best feelings, — both sides, both countries split their sides with laughter\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"2015\u0027\u0027 January 7, \u0026quot;Kevrob\u0026quot; (username), \u0027Re: SF influence spreads to real world\u0027, in \u0026lt;tt\u0026gt;rec.arts.sf.written\u0026lt;/tt\u0026gt;, \u0027Usenet\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"Taking the period 1945-1991 as one long war by proxy between the US and its allies and the \u0027\u0027CCCP\u0027\u0027 and its puppet regimes (and sometimes Red China), the \u0026quot;Korean War\u0026quot; and \u0026quot;the Viet Nam War\u0026quot; can be considered battles or theaters in the larger conflict\", \"priority\":13}]}, \"synonyms\":{}}");

	}

	private static void add(String term, String json) {
		map.put(term, GsonUtils.toObject(json, Entry.class));
	}

	public static Entry get(String term) {
		return map.get(term);
	}

	public static boolean has(String term) {
		return null != get(term);
	}
}